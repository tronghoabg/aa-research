.class public abstract LS3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:I = -0x1

.field public static c:I = -0x1

.field public static d:I = 0x8

.field public static e:I = 0x11

.field public static f:LVa/X7; = null

.field public static g:Ljava/lang/String; = "Overlay is activated"

.field public static h:Ljava/lang/String; = "Tap to edit settings or disable"

.field public static i:Ljava/lang/String; = "none"

.field public static j:I = 0x0

.field public static k:Z = false

.field public static l:Z = false

.field public static m:Ljava/lang/reflect/Method; = null

.field public static n:Z = false

.field public static o:Ljava/lang/reflect/Field;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    iput v0, p0, LS3/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Ljava/lang/NullPointerException;

    .line 4
    .line 5
    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    .line 6
    .line 7
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of v0, p0, LKe/d;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    instance-of v0, p0, LKe/c;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    instance-of v0, p0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    instance-of v0, p0, Ljava/lang/NullPointerException;

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_4
    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_5
    instance-of v0, p0, LKe/b;

    .line 37
    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_6
    new-instance v0, LCd/s0;

    .line 42
    .line 43
    invoke-direct {v0, p0}, LCd/s0;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1, v0, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static B(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_1
    new-array v2, v1, [Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 19
    new-instance v0, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "Expected instanceof GlideModule, but found: "

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :catch_0
    move-exception v1

    .line 40
    goto :goto_0

    .line 41
    :catch_1
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :catch_2
    move-exception v1

    .line 44
    goto :goto_2

    .line 45
    :catch_3
    move-exception v1

    .line 46
    goto :goto_3

    .line 47
    :goto_0
    invoke-static {p0, v1}, LS3/f;->J(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :goto_1
    invoke-static {p0, v1}, LS3/f;->J(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :goto_2
    invoke-static {p0, v1}, LS3/f;->J(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :goto_3
    invoke-static {p0, v1}, LS3/f;->J(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :catch_4
    move-exception p0

    .line 64
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string v1, "Unable to find GlideModule implementation"

    .line 67
    .line 68
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method public static C(Ljava/lang/String;)Ljava/util/Map;
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "\\."

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const-string v4, "FirebaseAppCheck"

    .line 15
    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    const-string v0, "Invalid token (too few subsections):\n"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {v4, p0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    const/4 p0, 0x1

    .line 31
    aget-object p0, v0, p0

    .line 32
    .line 33
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 34
    .line 35
    const/16 v1, 0xb

    .line 36
    .line 37
    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v1, "UTF-8"

    .line 42
    .line 43
    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    :cond_1
    move-object p0, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :try_start_1
    new-instance p0, Lorg/json/JSONObject;

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 60
    .line 61
    if-eq p0, v0, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, LS3/f;->M(Lorg/json/JSONObject;)Lx/e;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p0

    .line 69
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v1, "Failed to parse JSONObject into Map:\n"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/4 v0, 0x3

    .line 84
    invoke-static {v4, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    invoke-static {v4, p0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 91
    .line 92
    .line 93
    :cond_3
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 94
    .line 95
    :goto_0
    if-nez p0, :cond_4

    .line 96
    .line 97
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catch_1
    move-exception p0

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    :goto_1
    return-object p0

    .line 103
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v1, "Unable to decode token (charset unknown):\n"

    .line 106
    .line 107
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {v4, p0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 121
    .line 122
    return-object p0
.end method

.method public static D(LJ5/y;III)I
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-gt v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 18
    .line 19
    .line 20
    shl-int v0, v2, p1

    .line 21
    .line 22
    sub-int/2addr v0, v2

    .line 23
    shl-int v1, v2, p2

    .line 24
    .line 25
    sub-int/2addr v1, v2

    .line 26
    invoke-static {v0, v1}, LA6/c;->n(II)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    shl-int/2addr v2, p3

    .line 31
    invoke-static {v3, v2}, LA6/c;->n(II)I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, LJ5/y;->b()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v2, p1, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0, p1}, LJ5/y;->i(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-ne p1, v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0}, LJ5/y;->b()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ge v0, p2, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p0, p2}, LJ5/y;->i(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    add-int/2addr p1, p2

    .line 59
    if-ne p2, v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, LJ5/y;->b()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-ge p2, p3, :cond_3

    .line 66
    .line 67
    :goto_1
    const/4 p0, -0x1

    .line 68
    return p0

    .line 69
    :cond_3
    invoke-virtual {p0, p3}, LJ5/y;->i(I)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    add-int/2addr p0, p1

    .line 74
    return p0

    .line 75
    :cond_4
    return p1
.end method

.method public static final E(Lt0/t;)Lt0/I;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lt0/t;->g:Lu0/n;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v0, "LayoutNode should be attached to an owner"

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method

.method public static F(J)I
    .locals 2

    .line 1
    const-wide/32 v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const p0, 0x7fffffff

    .line 9
    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const-wide/32 v0, -0x80000000

    .line 13
    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    const/high16 p0, -0x80000000

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    long-to-int p0, p0

    .line 23
    return p0
.end method

.method public static G(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "flagNotFocusable"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "defaultFlag"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    const/16 v0, 0x8

    .line 18
    .line 19
    sput v0, LS3/f;->d:I

    .line 20
    .line 21
    :cond_1
    const-string v0, "flagNotTouchable"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const-string v0, "clickThrough"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    :cond_2
    const/16 v0, 0x318

    .line 38
    .line 39
    sput v0, LS3/f;->d:I

    .line 40
    .line 41
    :cond_3
    const-string v0, "flagNotTouchModal"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    const-string v0, "focusPointer"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    return-void

    .line 59
    :cond_5
    :goto_0
    const/16 p0, 0x20

    .line 60
    .line 61
    sput p0, LS3/f;->d:I

    .line 62
    .line 63
    return-void
.end method

.method public static H(LJ5/y;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, LJ5/y;->t(I)V

    .line 3
    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LJ5/y;->t(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LJ5/y;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, LJ5/y;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    invoke-virtual {p0, v0}, LJ5/y;->t(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    invoke-virtual {p0, v0}, LJ5/y;->t(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static I(LJ5/y;)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x6

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, LJ5/y;->t(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v3, 0x5

    .line 14
    const/16 v4, 0x8

    .line 15
    .line 16
    const/16 v5, 0x10

    .line 17
    .line 18
    invoke-static {p0, v3, v4, v5}, LS3/f;->D(LJ5/y;III)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x1

    .line 23
    add-int/2addr v5, v6

    .line 24
    const/4 v7, 0x7

    .line 25
    if-ne v1, v6, :cond_1

    .line 26
    .line 27
    mul-int/2addr v5, v7

    .line 28
    invoke-virtual {p0, v5}, LJ5/y;->t(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-ne v1, v0, :cond_9

    .line 33
    .line 34
    invoke-virtual {p0}, LJ5/y;->h()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    move v8, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v8, v3

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    move v3, v7

    .line 46
    :cond_3
    if-eqz v1, :cond_4

    .line 47
    .line 48
    move v2, v4

    .line 49
    :cond_4
    const/4 v1, 0x0

    .line 50
    move v4, v1

    .line 51
    :goto_1
    if-ge v4, v5, :cond_9

    .line 52
    .line 53
    invoke-virtual {p0}, LJ5/y;->h()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const/16 v10, 0xb4

    .line 58
    .line 59
    if-eqz v9, :cond_5

    .line 60
    .line 61
    invoke-virtual {p0, v7}, LJ5/y;->t(I)V

    .line 62
    .line 63
    .line 64
    move v9, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const/4 v11, 0x3

    .line 71
    if-ne v9, v11, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0, v3}, LJ5/y;->i(I)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    mul-int/2addr v9, v8

    .line 78
    if-eqz v9, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0}, LJ5/y;->s()V

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-virtual {p0, v2}, LJ5/y;->i(I)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    mul-int/2addr v9, v8

    .line 88
    if-eqz v9, :cond_7

    .line 89
    .line 90
    if-eq v9, v10, :cond_7

    .line 91
    .line 92
    invoke-virtual {p0}, LJ5/y;->s()V

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-virtual {p0}, LJ5/y;->s()V

    .line 96
    .line 97
    .line 98
    :goto_2
    if-eqz v9, :cond_8

    .line 99
    .line 100
    if-eq v9, v10, :cond_8

    .line 101
    .line 102
    invoke-virtual {p0}, LJ5/y;->h()Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_8

    .line 107
    .line 108
    add-int/lit8 v4, v4, 0x1

    .line 109
    .line 110
    :cond_8
    add-int/2addr v4, v6

    .line 111
    goto :goto_1

    .line 112
    :cond_9
    return-void
.end method

.method public static J(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v1, "Unable to instantiate GlideModule implementation for "

    .line 4
    .line 5
    invoke-static {p0, v1}, LVa/M6;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public static K(Ljava/util/Collection;)[I
    .locals 4

    .line 1
    instance-of v0, p0, Lo8/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lo8/b;

    .line 6
    .line 7
    iget v0, p0, Lo8/b;->b:I

    .line 8
    .line 9
    iget v1, p0, Lo8/b;->c:I

    .line 10
    .line 11
    iget-object p0, p0, Lo8/b;->a:[I

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    array-length v0, p0

    .line 23
    new-array v1, v0, [I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v3, p0, v2

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v3, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    aput v3, v1, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v1
.end method

.method public static L(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v3, v2, Lorg/json/JSONArray;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast v2, Lorg/json/JSONArray;

    .line 22
    .line 23
    invoke-static {v2}, LS3/f;->L(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    instance-of v3, v2, Lorg/json/JSONObject;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    check-cast v2, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-static {v2}, LS3/f;->M(Lorg/json/JSONObject;)Lx/e;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-object v0
.end method

.method public static M(Lorg/json/JSONObject;)Lx/e;
    .locals 5

    .line 1
    new-instance v0, Lx/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lx/v;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    instance-of v4, v3, Lorg/json/JSONArray;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    check-cast v3, Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-static {v3}, LS3/f;->L(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    check-cast v3, Lorg/json/JSONObject;

    .line 43
    .line 44
    invoke-static {v3}, LS3/f;->M(Lorg/json/JSONObject;)Lx/e;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    :cond_2
    :goto_1
    invoke-virtual {v0, v2, v3}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-object v0
.end method

.method public static N(JJIJ)J
    .locals 7

    .line 1
    sub-long v0, p2, p5

    .line 2
    .line 3
    int-to-long v4, p4

    .line 4
    sget p2, LQ1/x;->a:I

    .line 5
    .line 6
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 7
    .line 8
    const-wide/32 v2, 0xf4240

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v6}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p2

    .line 15
    add-long/2addr p0, p2

    .line 16
    return-wide p0
.end method

.method public static final O(F)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x41200000    # 10.0f

    .line 8
    .line 9
    float-to-double v1, v1

    .line 10
    int-to-double v3, v0

    .line 11
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    double-to-float v1, v1

    .line 16
    mul-float/2addr p0, v1

    .line 17
    float-to-int v2, p0

    .line 18
    int-to-float v3, v2

    .line 19
    sub-float/2addr p0, v3

    .line 20
    const/high16 v3, 0x3f000000    # 0.5f

    .line 21
    .line 22
    cmpl-float p0, p0, v3

    .line 23
    .line 24
    if-ltz p0, :cond_0

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    :cond_0
    int-to-float p0, v2

    .line 29
    div-float/2addr p0, v1

    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    float-to-int p0, p0

    .line 38
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static P(Landroid/view/View;Lld/c;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-interface {p1, p0}, Lld/c;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    check-cast p0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    move v1, v0

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, p1}, LS3/f;->P(Landroid/view/View;Lld/c;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    :goto_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_2
    return v0
.end method

.method public static Q(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    :cond_0
    :goto_0
    move-object v0, v3

    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v5, 0x2d

    .line 23
    .line 24
    if-ne v4, v5, :cond_2

    .line 25
    .line 26
    move v2, v1

    .line 27
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ne v2, v4, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    add-int/lit8 v4, v2, 0x1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/4 v6, -0x1

    .line 41
    const/16 v7, 0x80

    .line 42
    .line 43
    if-ge v5, v7, :cond_4

    .line 44
    .line 45
    sget-object v8, Lo8/c;->a:[B

    .line 46
    .line 47
    aget-byte v5, v8, v5

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    sget-object v5, Lo8/c;->a:[B

    .line 51
    .line 52
    move v5, v6

    .line 53
    :goto_1
    if-ltz v5, :cond_0

    .line 54
    .line 55
    const/16 v8, 0xa

    .line 56
    .line 57
    if-lt v5, v8, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    neg-int v5, v5

    .line 61
    int-to-long v9, v5

    .line 62
    int-to-long v11, v8

    .line 63
    const-wide/high16 v13, -0x8000000000000000L

    .line 64
    .line 65
    div-long v15, v13, v11

    .line 66
    .line 67
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-ge v4, v5, :cond_9

    .line 72
    .line 73
    add-int/lit8 v5, v4, 0x1

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ge v4, v7, :cond_6

    .line 80
    .line 81
    sget-object v17, Lo8/c;->a:[B

    .line 82
    .line 83
    aget-byte v4, v17, v4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    sget-object v4, Lo8/c;->a:[B

    .line 87
    .line 88
    move v4, v6

    .line 89
    :goto_3
    if-ltz v4, :cond_0

    .line 90
    .line 91
    if-ge v4, v8, :cond_0

    .line 92
    .line 93
    cmp-long v17, v9, v15

    .line 94
    .line 95
    if-gez v17, :cond_7

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_7
    mul-long/2addr v9, v11

    .line 99
    move/from16 v18, v2

    .line 100
    .line 101
    int-to-long v1, v4

    .line 102
    add-long v19, v1, v13

    .line 103
    .line 104
    cmp-long v4, v9, v19

    .line 105
    .line 106
    if-gez v4, :cond_8

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_8
    sub-long/2addr v9, v1

    .line 110
    move v4, v5

    .line 111
    move/from16 v2, v18

    .line 112
    .line 113
    const/4 v1, 0x1

    .line 114
    goto :goto_2

    .line 115
    :cond_9
    move/from16 v18, v2

    .line 116
    .line 117
    if-eqz v18, :cond_a

    .line 118
    .line 119
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto :goto_4

    .line 124
    :cond_a
    cmp-long v0, v9, v13

    .line 125
    .line 126
    if-nez v0, :cond_b

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_b
    neg-long v0, v9

    .line 130
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_4
    if-eqz v0, :cond_d

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v1

    .line 140
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    int-to-long v4, v4

    .line 145
    cmp-long v1, v1, v4

    .line 146
    .line 147
    if-eqz v1, :cond_c

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :cond_d
    :goto_5
    return-object v3
.end method

.method public static R(Landroid/content/Context;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitDiskReads()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitDiskWrites()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    :try_start_2
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 37
    .line 38
    .line 39
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    :goto_0
    const-string v0, "Unexpected exception."

    .line 41
    .line 42
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzcaf;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcah;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "StrictModeUtil.runWithLaxStrictMode"

    .line 50
    .line 51
    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzcah;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static final a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    array-length v2, p0

    .line 17
    invoke-static {p0, v0, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 24
    .line 25
    const-string v3, "BitmapCreationError"

    .line 26
    .line 27
    const-string v4, "BitmapFactory failed to decode the byte array"

    .line 28
    .line 29
    const/16 v7, 0xc

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    move-object p0, v0

    .line 40
    move-object v5, p0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    return-object p0

    .line 43
    :cond_2
    :goto_0
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 44
    .line 45
    const-string v3, "BitmapCreationError"

    .line 46
    .line 47
    const-string v4, "Base64 string is null or empty"

    .line 48
    .line 49
    const/4 v6, 0x4

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static/range {v2 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :goto_1
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 57
    .line 58
    const/16 v7, 0x8

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    const-string v3, "BitmapCreationError"

    .line 62
    .line 63
    const-string v4, "Error creating bitmap from base64"

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public static final b(FFJJILZ/k;LN/o;I)V
    .locals 24

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p8

    .line 6
    .line 7
    const v0, -0x1183dc16

    .line 8
    .line 9
    .line 10
    invoke-virtual {v7, v0}, LN/o;->N(I)LN/o;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v7, v1}, LN/o;->b(F)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int v0, p9, v0

    .line 23
    .line 24
    invoke-virtual {v7, v2}, LN/o;->b(F)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    const/16 v3, 0x100

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v3, 0x80

    .line 34
    .line 35
    :goto_1
    or-int/2addr v0, v3

    .line 36
    move-wide/from16 v3, p2

    .line 37
    .line 38
    invoke-virtual {v7, v3, v4}, LN/o;->d(J)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    const/16 v5, 0x800

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v5, 0x400

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v5

    .line 50
    move-wide/from16 v10, p4

    .line 51
    .line 52
    invoke-virtual {v7, v10, v11}, LN/o;->d(J)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x4000

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v5, 0x2000

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v5

    .line 64
    move/from16 v12, p6

    .line 65
    .line 66
    invoke-virtual {v7, v12}, LN/o;->c(I)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    const/high16 v5, 0x20000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/high16 v5, 0x10000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v5

    .line 78
    const/high16 v5, 0x180000

    .line 79
    .line 80
    or-int/2addr v0, v5

    .line 81
    const v5, 0x92493

    .line 82
    .line 83
    .line 84
    and-int/2addr v5, v0

    .line 85
    const v6, 0x92492

    .line 86
    .line 87
    .line 88
    if-ne v5, v6, :cond_6

    .line 89
    .line 90
    invoke-virtual {v7}, LN/o;->x()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_5

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_5
    invoke-virtual {v7}, LN/o;->I()V

    .line 98
    .line 99
    .line 100
    :goto_5
    move-object/from16 v8, p7

    .line 101
    .line 102
    goto/16 :goto_b

    .line 103
    .line 104
    :cond_6
    :goto_6
    sget-object v13, LZ/i;->a:LZ/i;

    .line 105
    .line 106
    float-to-double v5, v1

    .line 107
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    double-to-float v5, v5

    .line 112
    float-to-int v14, v5

    .line 113
    const/high16 v5, 0x41200000    # 10.0f

    .line 114
    .line 115
    mul-float/2addr v5, v1

    .line 116
    invoke-static {v5}, Lvf/a;->H(F)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    mul-int/lit8 v6, v14, 0xa

    .line 121
    .line 122
    sub-int v15, v5, v6

    .line 123
    .line 124
    const v5, 0x2952b718

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v5}, LN/o;->M(I)V

    .line 128
    .line 129
    .line 130
    sget-object v5, LE/i;->a:LE/f;

    .line 131
    .line 132
    invoke-static {v5, v7}, LE/J;->a(LE/c;LN/o;)Lr0/n;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    const v6, -0x4ee9b9da

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7, v6}, LN/o;->M(I)V

    .line 140
    .line 141
    .line 142
    sget-object v6, Lu0/M;->e:LN/L0;

    .line 143
    .line 144
    invoke-virtual {v7, v6}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, LL0/b;

    .line 149
    .line 150
    sget-object v8, Lu0/M;->k:LN/L0;

    .line 151
    .line 152
    invoke-virtual {v7, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    check-cast v8, LL0/i;

    .line 157
    .line 158
    sget-object v9, Lu0/M;->o:LN/L0;

    .line 159
    .line 160
    invoke-virtual {v7, v9}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    check-cast v9, Lu0/p0;

    .line 165
    .line 166
    sget-object v17, Lt0/c;->g9:Lt0/b;

    .line 167
    .line 168
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    sget-object v1, Lt0/b;->b:Lt0/d;

    .line 172
    .line 173
    invoke-static {v13}, LS3/f;->y(LZ/k;)LV/d;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v7}, LN/o;->O()V

    .line 178
    .line 179
    .line 180
    iget-boolean v4, v7, LN/o;->O:Z

    .line 181
    .line 182
    if-eqz v4, :cond_7

    .line 183
    .line 184
    invoke-virtual {v7, v1}, LN/o;->k(Ltf/a;)V

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_7
    invoke-virtual {v7}, LN/o;->X()V

    .line 189
    .line 190
    .line 191
    :goto_7
    const/4 v1, 0x0

    .line 192
    iput-boolean v1, v7, LN/o;->x:Z

    .line 193
    .line 194
    sget-object v4, Lt0/b;->e:Lt0/a;

    .line 195
    .line 196
    invoke-static {v7, v5, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 197
    .line 198
    .line 199
    sget-object v4, Lt0/b;->d:Lt0/a;

    .line 200
    .line 201
    invoke-static {v7, v6, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 202
    .line 203
    .line 204
    sget-object v4, Lt0/b;->f:Lt0/a;

    .line 205
    .line 206
    invoke-static {v7, v8, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 207
    .line 208
    .line 209
    sget-object v4, Lt0/b;->g:Lt0/a;

    .line 210
    .line 211
    invoke-static {v7, v9, v4, v7}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    const v5, 0x7ab4aae9

    .line 216
    .line 217
    .line 218
    invoke-static {v1, v3, v4, v7, v5}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 219
    .line 220
    .line 221
    const v3, -0x286e2e7f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v7, v3}, LN/o;->M(I)V

    .line 225
    .line 226
    .line 227
    const v3, 0x69524637

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7, v3}, LN/o;->M(I)V

    .line 231
    .line 232
    .line 233
    const/4 v3, 0x1

    .line 234
    :goto_8
    if-gt v3, v14, :cond_8

    .line 235
    .line 236
    const v4, -0x3f084f25

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7, v4}, LN/o;->M(I)V

    .line 240
    .line 241
    .line 242
    move v4, v3

    .line 243
    invoke-static {}, Ltg/b;->A()Li0/d;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    move v5, v4

    .line 248
    invoke-static {v13, v2}, LE/L;->c(LZ/k;F)LZ/k;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    and-int/lit16 v6, v0, 0x1c00

    .line 253
    .line 254
    or-int/lit8 v8, v6, 0x30

    .line 255
    .line 256
    move v9, v5

    .line 257
    move-wide/from16 v5, p2

    .line 258
    .line 259
    invoke-static/range {v3 .. v8}, LK/t;->b(Li0/d;LZ/k;JLN/o;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 263
    .line 264
    .line 265
    move v8, v2

    .line 266
    const/4 v10, 0x1

    .line 267
    goto :goto_a

    .line 268
    :cond_8
    move v9, v3

    .line 269
    add-int/lit8 v3, v14, 0x1

    .line 270
    .line 271
    if-ne v9, v3, :cond_a

    .line 272
    .line 273
    const/4 v3, 0x1

    .line 274
    if-gt v3, v15, :cond_9

    .line 275
    .line 276
    const/16 v4, 0xa

    .line 277
    .line 278
    if-ge v15, v4, :cond_9

    .line 279
    .line 280
    const v4, -0x3f02538d

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v4}, LN/o;->M(I)V

    .line 284
    .line 285
    .line 286
    shr-int/lit8 v4, v0, 0x6

    .line 287
    .line 288
    and-int/lit16 v8, v4, 0x3fe

    .line 289
    .line 290
    move-wide v5, v10

    .line 291
    move v10, v3

    .line 292
    move-wide/from16 v3, p2

    .line 293
    .line 294
    invoke-static/range {v2 .. v8}, LS3/f;->c(FJJLN/o;I)V

    .line 295
    .line 296
    .line 297
    move v8, v2

    .line 298
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 299
    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_9
    move v8, v2

    .line 303
    move v10, v3

    .line 304
    goto :goto_9

    .line 305
    :cond_a
    move v8, v2

    .line 306
    const/4 v10, 0x1

    .line 307
    :goto_9
    const v2, -0x3efe8e12

    .line 308
    .line 309
    .line 310
    invoke-virtual {v7, v2}, LN/o;->M(I)V

    .line 311
    .line 312
    .line 313
    invoke-static {}, Ltg/b;->A()Li0/d;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-static {v13, v8}, LE/L;->c(LZ/k;F)LZ/k;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    shr-int/lit8 v4, v0, 0x3

    .line 322
    .line 323
    and-int/lit16 v4, v4, 0x1c00

    .line 324
    .line 325
    or-int/lit8 v4, v4, 0x30

    .line 326
    .line 327
    move-object v6, v7

    .line 328
    move v7, v4

    .line 329
    move-wide/from16 v4, p4

    .line 330
    .line 331
    invoke-static/range {v2 .. v7}, LK/t;->b(Li0/d;LZ/k;JLN/o;I)V

    .line 332
    .line 333
    .line 334
    move-object v7, v6

    .line 335
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 336
    .line 337
    .line 338
    :goto_a
    const/4 v2, 0x5

    .line 339
    if-eq v9, v2, :cond_b

    .line 340
    .line 341
    add-int/lit8 v3, v9, 0x1

    .line 342
    .line 343
    move-wide/from16 v10, p4

    .line 344
    .line 345
    move v2, v8

    .line 346
    goto :goto_8

    .line 347
    :cond_b
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 348
    .line 349
    .line 350
    const/4 v0, 0x4

    .line 351
    int-to-float v0, v0

    .line 352
    invoke-static {v0}, LE/L;->f(F)LZ/k;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v7, v0}, Lka/e0;->b(LN/o;LZ/k;)V

    .line 357
    .line 358
    .line 359
    invoke-static/range {p0 .. p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    sget-wide v4, Le0/q;->d:J

    .line 364
    .line 365
    invoke-static {v12}, LFe/b;->E(I)J

    .line 366
    .line 367
    .line 368
    move-result-wide v6

    .line 369
    const/16 v19, 0x0

    .line 370
    .line 371
    const/16 v21, 0x180

    .line 372
    .line 373
    const/4 v3, 0x0

    .line 374
    const/4 v8, 0x0

    .line 375
    const/4 v9, 0x0

    .line 376
    move v0, v10

    .line 377
    const-wide/16 v10, 0x0

    .line 378
    .line 379
    const/4 v12, 0x0

    .line 380
    move-object v15, v13

    .line 381
    const-wide/16 v13, 0x0

    .line 382
    .line 383
    move-object/from16 v16, v15

    .line 384
    .line 385
    const/4 v15, 0x0

    .line 386
    move-object/from16 v17, v16

    .line 387
    .line 388
    const/16 v16, 0x0

    .line 389
    .line 390
    move-object/from16 v18, v17

    .line 391
    .line 392
    const/16 v17, 0x1

    .line 393
    .line 394
    move-object/from16 v20, v18

    .line 395
    .line 396
    const/16 v18, 0x0

    .line 397
    .line 398
    const/16 v22, 0xc00

    .line 399
    .line 400
    const v23, 0xdff2

    .line 401
    .line 402
    .line 403
    move-object/from16 p7, v20

    .line 404
    .line 405
    move-object/from16 v20, p8

    .line 406
    .line 407
    invoke-static/range {v2 .. v23}, LK/I;->b(Ljava/lang/String;LZ/k;JJLE0/l;LE0/o;JLK0/c;JIZILK/B;Lz0/p;LN/o;III)V

    .line 408
    .line 409
    .line 410
    move-object/from16 v7, v20

    .line 411
    .line 412
    invoke-static {v7, v1, v1, v0, v1}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 416
    .line 417
    .line 418
    goto/16 :goto_5

    .line 419
    .line 420
    :goto_b
    invoke-virtual {v7}, LN/o;->r()LN/i0;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    if-eqz v10, :cond_c

    .line 425
    .line 426
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/I;

    .line 427
    .line 428
    move/from16 v1, p0

    .line 429
    .line 430
    move/from16 v2, p1

    .line 431
    .line 432
    move-wide/from16 v3, p2

    .line 433
    .line 434
    move-wide/from16 v5, p4

    .line 435
    .line 436
    move/from16 v7, p6

    .line 437
    .line 438
    move/from16 v9, p9

    .line 439
    .line 440
    invoke-direct/range {v0 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/I;-><init>(FFJJILZ/k;I)V

    .line 441
    .line 442
    .line 443
    iput-object v0, v10, LN/i0;->d:Ltf/p;

    .line 444
    .line 445
    :cond_c
    return-void
.end method

.method public static final c(FJJLN/o;I)V
    .locals 16

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move/from16 v0, p6

    .line 6
    .line 7
    const v2, -0x78322060

    .line 8
    .line 9
    .line 10
    invoke-virtual {v6, v2}, LN/o;->N(I)LN/o;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v0, 0x6

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v6, v1}, LN/o;->b(F)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x2

    .line 26
    :goto_0
    or-int/2addr v2, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v0

    .line 29
    :goto_1
    and-int/lit8 v3, v0, 0x30

    .line 30
    .line 31
    move-wide/from16 v8, p1

    .line 32
    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    invoke-virtual {v6, v8, v9}, LN/o;->d(J)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    const/16 v3, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v3, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v2, v3

    .line 47
    :cond_3
    and-int/lit16 v3, v0, 0x180

    .line 48
    .line 49
    move-wide/from16 v4, p3

    .line 50
    .line 51
    if-nez v3, :cond_5

    .line 52
    .line 53
    invoke-virtual {v6, v4, v5}, LN/o;->d(J)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    const/16 v3, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v3, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v2, v3

    .line 65
    :cond_5
    move v10, v2

    .line 66
    and-int/lit16 v2, v10, 0x93

    .line 67
    .line 68
    const/16 v3, 0x92

    .line 69
    .line 70
    if-ne v2, v3, :cond_7

    .line 71
    .line 72
    invoke-virtual {v6}, LN/o;->x()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_6

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_6
    invoke-virtual {v6}, LN/o;->I()V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_7
    :goto_4
    sget-object v2, LZ/i;->a:LZ/i;

    .line 85
    .line 86
    invoke-static {v2, v1}, LE/L;->c(LZ/k;F)LZ/k;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const v3, 0x2bb5b5d7

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v3}, LN/o;->M(I)V

    .line 94
    .line 95
    .line 96
    sget-object v3, LZ/a;->a:LZ/d;

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    invoke-static {v3, v11, v6}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const v7, -0x4ee9b9da

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v7}, LN/o;->M(I)V

    .line 107
    .line 108
    .line 109
    sget-object v7, Lu0/M;->e:LN/L0;

    .line 110
    .line 111
    invoke-virtual {v6, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, LL0/b;

    .line 116
    .line 117
    sget-object v12, Lu0/M;->k:LN/L0;

    .line 118
    .line 119
    invoke-virtual {v6, v12}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    check-cast v12, LL0/i;

    .line 124
    .line 125
    sget-object v13, Lu0/M;->o:LN/L0;

    .line 126
    .line 127
    invoke-virtual {v6, v13}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    check-cast v13, Lu0/p0;

    .line 132
    .line 133
    sget-object v14, Lt0/c;->g9:Lt0/b;

    .line 134
    .line 135
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget-object v14, Lt0/b;->b:Lt0/d;

    .line 139
    .line 140
    invoke-static {v2}, LS3/f;->y(LZ/k;)LV/d;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v6}, LN/o;->O()V

    .line 145
    .line 146
    .line 147
    iget-boolean v15, v6, LN/o;->O:Z

    .line 148
    .line 149
    if-eqz v15, :cond_8

    .line 150
    .line 151
    invoke-virtual {v6, v14}, LN/o;->k(Ltf/a;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_8
    invoke-virtual {v6}, LN/o;->X()V

    .line 156
    .line 157
    .line 158
    :goto_5
    iput-boolean v11, v6, LN/o;->x:Z

    .line 159
    .line 160
    sget-object v14, Lt0/b;->e:Lt0/a;

    .line 161
    .line 162
    invoke-static {v6, v3, v14}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 163
    .line 164
    .line 165
    sget-object v3, Lt0/b;->d:Lt0/a;

    .line 166
    .line 167
    invoke-static {v6, v7, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 168
    .line 169
    .line 170
    sget-object v3, Lt0/b;->f:Lt0/a;

    .line 171
    .line 172
    invoke-static {v6, v12, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 173
    .line 174
    .line 175
    sget-object v3, Lt0/b;->g:Lt0/a;

    .line 176
    .line 177
    invoke-static {v6, v13, v3, v6}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    const v7, 0x7ab4aae9

    .line 182
    .line 183
    .line 184
    invoke-static {v11, v2, v3, v6, v7}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 185
    .line 186
    .line 187
    const v2, -0x7f65a980

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    .line 191
    .line 192
    .line 193
    invoke-static {}, Ltg/b;->A()Li0/d;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    new-instance v3, LE/j;

    .line 198
    .line 199
    sget-object v12, LZ/a;->e:LZ/d;

    .line 200
    .line 201
    const/4 v13, 0x1

    .line 202
    invoke-direct {v3, v12, v13}, LE/j;-><init>(LZ/d;Z)V

    .line 203
    .line 204
    .line 205
    shl-int/lit8 v7, v10, 0x3

    .line 206
    .line 207
    and-int/lit16 v7, v7, 0x1c00

    .line 208
    .line 209
    or-int/lit8 v7, v7, 0x30

    .line 210
    .line 211
    invoke-static/range {v2 .. v7}, LK/t;->b(Li0/d;LZ/k;JLN/o;I)V

    .line 212
    .line 213
    .line 214
    invoke-static {}, Ltg/b;->A()Li0/d;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    new-instance v3, LE/j;

    .line 219
    .line 220
    invoke-direct {v3, v12, v13}, LE/j;-><init>(LZ/d;Z)V

    .line 221
    .line 222
    .line 223
    const v4, -0x684886c9

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v4}, LN/o;->M(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    sget-object v5, LN/k;->a:LN/P;

    .line 234
    .line 235
    if-ne v4, v5, :cond_9

    .line 236
    .line 237
    new-instance v4, Lcom/moloco/sdk/internal/publisher/d;

    .line 238
    .line 239
    const/16 v5, 0x11

    .line 240
    .line 241
    invoke-direct {v4, v5}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_9
    check-cast v4, Ltf/l;

    .line 248
    .line 249
    invoke-virtual {v6, v11}, LN/o;->p(Z)V

    .line 250
    .line 251
    .line 252
    const-string v5, "onDraw"

    .line 253
    .line 254
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    new-instance v5, Lb0/f;

    .line 258
    .line 259
    invoke-direct {v5, v4}, Lb0/f;-><init>(Ltf/l;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v3, v5}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    shl-int/lit8 v4, v10, 0x6

    .line 267
    .line 268
    and-int/lit16 v4, v4, 0x1c00

    .line 269
    .line 270
    or-int/lit8 v7, v4, 0x30

    .line 271
    .line 272
    move-wide v4, v8

    .line 273
    invoke-static/range {v2 .. v7}, LK/t;->b(Li0/d;LZ/k;JLN/o;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v6, v11, v11, v13, v11}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v11}, LN/o;->p(Z)V

    .line 280
    .line 281
    .line 282
    :goto_6
    invoke-virtual {v6}, LN/o;->r()LN/i0;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    if-eqz v7, :cond_a

    .line 287
    .line 288
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/J;

    .line 289
    .line 290
    move-wide/from16 v3, p1

    .line 291
    .line 292
    move-wide/from16 v5, p3

    .line 293
    .line 294
    move/from16 v2, p6

    .line 295
    .line 296
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/J;-><init>(FIJJ)V

    .line 297
    .line 298
    .line 299
    iput-object v0, v7, LN/i0;->d:Ltf/p;

    .line 300
    .line 301
    :cond_a
    return-void
.end method

.method public static final d(Ljava/lang/String;LV/d;LN/o;I)V
    .locals 12

    .line 1
    const v0, 0x29cf52c1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    and-int/lit8 v0, v0, 0x13

    .line 18
    .line 19
    const/16 v1, 0x12

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, LN/o;->x()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p2}, LN/o;->I()V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_2
    :goto_1
    const v0, 0x6d2479e7

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v2, LN/k;->a:LN/P;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    if-ne v1, v2, :cond_5

    .line 54
    .line 55
    :cond_3
    invoke-static {p0}, LS3/f;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    new-instance v1, Le0/d;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Le0/d;-><init>(Landroid/graphics/Bitmap;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/4 v0, 0x0

    .line 68
    move-object v1, v0

    .line 69
    :goto_2
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    check-cast v1, Le0/d;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 76
    .line 77
    .line 78
    const v3, 0x6d248a9f

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v3}, LN/o;->M(I)V

    .line 82
    .line 83
    .line 84
    const/4 v3, 0x6

    .line 85
    if-nez v1, :cond_6

    .line 86
    .line 87
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1, p2, v1}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-eqz p2, :cond_c

    .line 102
    .line 103
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;-><init>(Ljava/lang/String;LV/d;II)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 113
    .line 114
    .line 115
    sget-object v4, LZ/i;->a:LZ/i;

    .line 116
    .line 117
    invoke-static {v4}, LE/L;->a(LZ/k;)LZ/k;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const v6, 0x6d249f38

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v6}, LN/o;->M(I)V

    .line 125
    .line 126
    .line 127
    const-string v6, "Watermark Overlay"

    .line 128
    .line 129
    invoke-virtual {p2, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-nez v6, :cond_7

    .line 138
    .line 139
    if-ne v7, v2, :cond_8

    .line 140
    .line 141
    :cond_7
    new-instance v7, Lcom/moloco/sdk/internal/publisher/d;

    .line 142
    .line 143
    const/4 v6, 0x5

    .line 144
    invoke-direct {v7, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v7}, LN/o;->U(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    check-cast v7, Ltf/l;

    .line 151
    .line 152
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 153
    .line 154
    .line 155
    invoke-static {v5, v0, v7}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    const v6, 0x2bb5b5d7

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v6}, LN/o;->M(I)V

    .line 163
    .line 164
    .line 165
    sget-object v6, LZ/a;->a:LZ/d;

    .line 166
    .line 167
    invoke-static {v6, v0, p2}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    const v7, -0x4ee9b9da

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, v7}, LN/o;->M(I)V

    .line 175
    .line 176
    .line 177
    sget-object v7, Lu0/M;->e:LN/L0;

    .line 178
    .line 179
    invoke-virtual {p2, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    check-cast v7, LL0/b;

    .line 184
    .line 185
    sget-object v8, Lu0/M;->k:LN/L0;

    .line 186
    .line 187
    invoke-virtual {p2, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    check-cast v8, LL0/i;

    .line 192
    .line 193
    sget-object v9, Lu0/M;->o:LN/L0;

    .line 194
    .line 195
    invoke-virtual {p2, v9}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    check-cast v9, Lu0/p0;

    .line 200
    .line 201
    sget-object v10, Lt0/c;->g9:Lt0/b;

    .line 202
    .line 203
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    sget-object v10, Lt0/b;->b:Lt0/d;

    .line 207
    .line 208
    invoke-static {v5}, LS3/f;->y(LZ/k;)LV/d;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {p2}, LN/o;->O()V

    .line 213
    .line 214
    .line 215
    iget-boolean v11, p2, LN/o;->O:Z

    .line 216
    .line 217
    if-eqz v11, :cond_9

    .line 218
    .line 219
    invoke-virtual {p2, v10}, LN/o;->k(Ltf/a;)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_9
    invoke-virtual {p2}, LN/o;->X()V

    .line 224
    .line 225
    .line 226
    :goto_3
    iput-boolean v0, p2, LN/o;->x:Z

    .line 227
    .line 228
    sget-object v10, Lt0/b;->e:Lt0/a;

    .line 229
    .line 230
    invoke-static {p2, v6, v10}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 231
    .line 232
    .line 233
    sget-object v6, Lt0/b;->d:Lt0/a;

    .line 234
    .line 235
    invoke-static {p2, v7, v6}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 236
    .line 237
    .line 238
    sget-object v6, Lt0/b;->f:Lt0/a;

    .line 239
    .line 240
    invoke-static {p2, v8, v6}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 241
    .line 242
    .line 243
    sget-object v6, Lt0/b;->g:Lt0/a;

    .line 244
    .line 245
    invoke-static {p2, v9, v6, p2}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    const v7, 0x7ab4aae9

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v5, v6, p2, v7}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 253
    .line 254
    .line 255
    const v5, -0x7f65a980

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2, v5}, LN/o;->M(I)V

    .line 259
    .line 260
    .line 261
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {p1, p2, v5}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    invoke-static {v4}, LE/L;->a(LZ/k;)LZ/k;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    const v5, 0x23ea7639    # 2.54204E-17f

    .line 273
    .line 274
    .line 275
    invoke-virtual {p2, v5}, LN/o;->M(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p2, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    if-nez v5, :cond_a

    .line 287
    .line 288
    if-ne v6, v2, :cond_b

    .line 289
    .line 290
    :cond_a
    new-instance v6, LAf/r;

    .line 291
    .line 292
    const/16 v2, 0x12

    .line 293
    .line 294
    invoke-direct {v6, v1, v2}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p2, v6}, LN/o;->U(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_b
    check-cast v6, Ltf/l;

    .line 301
    .line 302
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 303
    .line 304
    .line 305
    invoke-static {v4, v6, p2, v3}, Landroid/support/v4/media/session/b;->F(LZ/k;Ltf/l;LN/o;I)V

    .line 306
    .line 307
    .line 308
    const/4 v1, 0x1

    .line 309
    invoke-static {p2, v0, v0, v1, v0}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 313
    .line 314
    .line 315
    :goto_4
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    if-eqz p2, :cond_c

    .line 320
    .line 321
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;

    .line 322
    .line 323
    const/4 v1, 0x1

    .line 324
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;-><init>(Ljava/lang/String;LV/d;II)V

    .line 325
    .line 326
    .line 327
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 328
    .line 329
    :cond_c
    return-void
.end method

.method public static e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    const/16 v3, 0x21

    .line 12
    .line 13
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v2

    .line 16
    .line 17
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ne v5, p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-ne v5, p3, :cond_0

    .line 28
    .line 29
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-ne v5, v3, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-interface {p0, p1, p2, p3, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static varargs f([I)Ljava/util/List;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lo8/b;

    .line 8
    .line 9
    array-length v1, p0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, p0, v2, v1}, Lo8/b;-><init>([III)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static g(Ljava/util/List;Ltf/l;Ltf/p;)Lya/b;
    .locals 7

    .line 1
    const-string v0, "from"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    :goto_0
    move-object v1, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-interface {p1, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Comparable;

    .line 38
    .line 39
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {p1, v4}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/Comparable;

    .line 48
    .line 49
    invoke-interface {v3, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-gez v6, :cond_3

    .line 54
    .line 55
    move-object v2, v4

    .line 56
    move-object v3, v5

    .line 57
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :goto_1
    if-eqz v1, :cond_7

    .line 65
    .line 66
    invoke-interface {p1, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    instance-of v1, v0, Ljava/util/Collection;

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    move-object v1, v0

    .line 80
    check-cast v1, Ljava/util/Collection;

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-interface {p1, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    const-string p1, "There should be no empty entries"

    .line 119
    .line 120
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_6
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-static {v0, p0, v1, p1, p2}, LS3/f;->h(Ljava/util/ArrayList;Ljava/util/List;ILtf/l;Ltf/p;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    .line 134
    .line 135
    .line 136
    new-instance p0, Lya/b;

    .line 137
    .line 138
    new-instance p1, LLd/a;

    .line 139
    .line 140
    sget-object p2, Lff/v;->a:Lff/v;

    .line 141
    .line 142
    invoke-direct {p1, v1, p2, v0}, LLd/a;-><init>(CLjava/util/List;Ljava/util/ArrayList;)V

    .line 143
    .line 144
    .line 145
    const/16 p1, 0x16

    .line 146
    .line 147
    invoke-direct {p0, p1}, Lya/b;-><init>(I)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 152
    .line 153
    const-string p1, "Unable to build char tree from an empty list"

    .line 154
    .line 155
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p0
.end method

.method public static h(Ljava/util/ArrayList;Ljava/util/List;ILtf/l;Ltf/p;)V
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {p4, v1, v2}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Character;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    new-instance v3, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/lang/Character;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/util/List;

    .line 90
    .line 91
    add-int/lit8 v2, p2, 0x1

    .line 92
    .line 93
    new-instance v3, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    check-cast v0, Ljava/lang/Iterable;

    .line 99
    .line 100
    new-instance v4, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_3

    .line 114
    .line 115
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-interface {p3, v6}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-le v7, v2, :cond_2

    .line 130
    .line 131
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-static {v3, v4, v2, p3, p4}, LS3/f;->h(Ljava/util/ArrayList;Ljava/util/List;ILtf/l;Ltf/p;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/util/ArrayList;->trimToSize()V

    .line 139
    .line 140
    .line 141
    new-instance v4, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-interface {p3, v5}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    check-cast v6, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-ne v6, v2, :cond_4

    .line 171
    .line 172
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_5
    new-instance v0, LLd/a;

    .line 177
    .line 178
    invoke-direct {v0, v1, v4, v3}, LLd/a;-><init>(CLjava/util/List;Ljava/util/ArrayList;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_6
    return-void
.end method

.method public static i(Landroid/content/Context;Lld/b;)V
    .locals 7

    .line 1
    invoke-static {p0}, LS3/f;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    sget v1, LD3/m;->a:I

    .line 8
    .line 9
    sget-object v1, LD3/n;->a:LD3/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LD3/o;->b:I

    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1e

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-lt v1, v2, :cond_0

    .line 22
    .line 23
    const-class v4, Landroid/view/WindowManager;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroid/view/WindowManager;

    .line 30
    .line 31
    invoke-static {v4}, LA7/N0;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, LA7/N0;->g(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "wm.maximumWindowMetrics.bounds"

    .line 40
    .line 41
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v4, "window"

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "null cannot be cast to non-null type android.view.WindowManager"

    .line 52
    .line 53
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v4, Landroid/view/WindowManager;

    .line 57
    .line 58
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "display"

    .line 63
    .line 64
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v5, Landroid/graphics/Point;

    .line 68
    .line 69
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v5}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Landroid/graphics/Rect;

    .line 76
    .line 77
    iget v6, v5, Landroid/graphics/Point;->x:I

    .line 78
    .line 79
    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 80
    .line 81
    invoke-direct {v4, v3, v3, v6, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 82
    .line 83
    .line 84
    :goto_0
    if-lt v1, v2, :cond_2

    .line 85
    .line 86
    if-lt v1, v2, :cond_1

    .line 87
    .line 88
    sget-object v1, LH3/a;->a:LH3/a;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, LH3/a;->a(Landroid/content/Context;)Lk1/v0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 96
    .line 97
    const-string p1, "Incompatible SDK version"

    .line 98
    .line 99
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_2
    const/16 v0, 0x22

    .line 104
    .line 105
    if-lt v1, v0, :cond_3

    .line 106
    .line 107
    new-instance v0, Lk1/k0;

    .line 108
    .line 109
    invoke-direct {v0}, Lk1/k0;-><init>()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    if-lt v1, v2, :cond_4

    .line 114
    .line 115
    new-instance v0, Lk1/j0;

    .line 116
    .line 117
    invoke-direct {v0}, Lk1/j0;-><init>()V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    const/16 v0, 0x1d

    .line 122
    .line 123
    if-lt v1, v0, :cond_5

    .line 124
    .line 125
    new-instance v0, Lk1/i0;

    .line 126
    .line 127
    invoke-direct {v0}, Lk1/i0;-><init>()V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    new-instance v0, Lk1/h0;

    .line 132
    .line 133
    invoke-direct {v0}, Lk1/h0;-><init>()V

    .line 134
    .line 135
    .line 136
    :goto_1
    invoke-virtual {v0}, Lk1/l0;->b()Lk1/v0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-string v1, "{\n            WindowInse\u2026ilder().build()\n        }"

    .line 141
    .line 142
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    iget v1, v4, Landroid/graphics/Rect;->left:I

    .line 146
    .line 147
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 148
    .line 149
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 150
    .line 151
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 152
    .line 153
    if-gt v1, v5, :cond_7

    .line 154
    .line 155
    if-gt v2, v4, :cond_6

    .line 156
    .line 157
    const-string v6, "_windowInsetsCompat"

    .line 158
    .line 159
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Landroid/graphics/Rect;

    .line 163
    .line 164
    invoke-direct {v0, v1, v2, v5, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-float v0, v0

    .line 172
    new-instance v6, Landroid/graphics/Rect;

    .line 173
    .line 174
    invoke-direct {v6, v1, v2, v5, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    int-to-float v1, v1

    .line 182
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 191
    .line 192
    check-cast p1, Llc/b;

    .line 193
    .line 194
    iget-object p1, p1, Llc/b;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 195
    .line 196
    invoke-virtual {p1, v3, v0, v1, p0}, Lio/flutter/embedding/engine/FlutterJNI;->updateDisplayMetrics(IFFF)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_6
    const-string p0, "top must be less than or equal to bottom, top: "

    .line 201
    .line 202
    const-string p1, ", bottom: "

    .line 203
    .line 204
    invoke-static {v2, v4, p0, p1}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :cond_7
    const-string p0, "Left must be less than or equal to right, left: "

    .line 219
    .line 220
    const-string p1, ", right: "

    .line 221
    .line 222
    invoke-static {v1, v5, p0, p1}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p1

    .line 236
    :cond_8
    return-void
.end method

.method public static j(Ljava/util/concurrent/Callable;)LHe/m;
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Scheduler Callable result can\'t be null"

    .line 6
    .line 7
    invoke-static {p0, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p0, LHe/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    invoke-static {p0}, LZe/d;->c(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public static k(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-static {p0, p1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    throw p0
.end method

.method public static l(J)I
    .locals 3

    .line 1
    long-to-int v0, p0

    .line 2
    int-to-long v1, v0

    .line 3
    cmp-long v1, v1, p0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    const-string v2, "Out of range: %s"

    .line 11
    .line 12
    invoke-static {v2, p0, p1, v1}, LFe/e;->o(Ljava/lang/String;JZ)V

    .line 13
    .line 14
    .line 15
    return v0
.end method

.method public static m(III)I
    .locals 0

    .line 1
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    return p1

    .line 4
    :cond_0
    if-le p0, p2, :cond_1

    .line 5
    .line 6
    return p2

    .line 7
    :cond_1
    return p0
.end method

.method public static n(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1c

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lk1/Q;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    const v0, 0x7f0a0291

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lk1/Q;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance v1, Lk1/Q;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, Lk1/Q;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    iput-object v2, v1, Lk1/Q;->b:Landroid/util/SparseArray;

    .line 33
    .line 34
    iput-object v2, v1, Lk1/Q;->c:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p0, v1, Lk1/Q;->c:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p0, v1, Lk1/Q;->c:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    iget-object p0, v1, Lk1/Q;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    new-instance p0, Landroid/util/SparseArray;

    .line 62
    .line 63
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p0, v1, Lk1/Q;->b:Landroid/util/SparseArray;

    .line 67
    .line 68
    :cond_3
    iget-object p0, v1, Lk1/Q;->b:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x1

    .line 75
    if-ne v0, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-ltz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 94
    .line 95
    .line 96
    :cond_4
    if-nez v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    move-object v2, p0

    .line 107
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 108
    .line 109
    :cond_5
    if-eqz v2, :cond_8

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Landroid/view/View;

    .line 116
    .line 117
    if-eqz p0, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    const p1, 0x7f0a0292

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Ljava/util/ArrayList;

    .line 133
    .line 134
    if-eqz p0, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    sub-int/2addr p1, v1

    .line 141
    if-gez p1, :cond_6

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance p0, Ljava/lang/ClassCastException;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :cond_7
    :goto_0
    return v1

    .line 158
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 159
    return p0
.end method

.method public static o(Lk1/i;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v3, 0x1c

    .line 10
    .line 11
    if-lt v2, v3, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, p3}, Lk1/i;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_1
    instance-of v2, p2, Landroid/app/Activity;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_9

    .line 22
    .line 23
    check-cast p2, Landroid/app/Activity;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/app/Activity;->onUserInteraction()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/16 p1, 0x8

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/view/Window;->hasFeature(I)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/16 v4, 0x52

    .line 49
    .line 50
    if-ne v2, v4, :cond_5

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    sget-boolean v2, LS3/f;->l:Z

    .line 55
    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v4, "onMenuKeyEvent"

    .line 63
    .line 64
    new-array v5, v0, [Ljava/lang/Class;

    .line 65
    .line 66
    const-class v6, Landroid/view/KeyEvent;

    .line 67
    .line 68
    aput-object v6, v5, v1

    .line 69
    .line 70
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sput-object v2, LS3/f;->m:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    :catch_0
    sput-boolean v0, LS3/f;->l:Z

    .line 77
    .line 78
    :cond_2
    sget-object v2, LS3/f;->m:Ljava/lang/reflect/Method;

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    :try_start_1
    new-array v4, v0, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object p3, v4, v1

    .line 85
    .line 86
    invoke-virtual {v2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-nez p1, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 99
    :catch_1
    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {p0, p3}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0, p3}, Lk1/S;->c(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_7

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_7
    if-eqz p0, :cond_8

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    :cond_8
    invoke-virtual {p3, p2, v3, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    :goto_1
    return v0

    .line 131
    :cond_9
    instance-of v2, p2, Landroid/app/Dialog;

    .line 132
    .line 133
    if-eqz v2, :cond_10

    .line 134
    .line 135
    check-cast p2, Landroid/app/Dialog;

    .line 136
    .line 137
    sget-boolean p0, LS3/f;->n:Z

    .line 138
    .line 139
    if-nez p0, :cond_a

    .line 140
    .line 141
    :try_start_2
    const-class p0, Landroid/app/Dialog;

    .line 142
    .line 143
    const-string p1, "mOnKeyListener"

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    sput-object p0, LS3/f;->o:Ljava/lang/reflect/Field;

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 152
    .line 153
    .line 154
    :catch_2
    sput-boolean v0, LS3/f;->n:Z

    .line 155
    .line 156
    :cond_a
    sget-object p0, LS3/f;->o:Ljava/lang/reflect/Field;

    .line 157
    .line 158
    if-eqz p0, :cond_b

    .line 159
    .line 160
    :try_start_3
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Landroid/content/DialogInterface$OnKeyListener;
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catch_3
    :cond_b
    move-object p0, v3

    .line 168
    :goto_2
    if-eqz p0, :cond_c

    .line 169
    .line 170
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-interface {p0, p2, p1, p3}, Landroid/content/DialogInterface$OnKeyListener;->onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_c

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_c
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0, p3}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_d

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_d
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {p0, p3}, Lk1/S;->c(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_e

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_e
    if-eqz p0, :cond_f

    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    :cond_f
    invoke-virtual {p3, p2, v3, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    :goto_3
    return v0

    .line 214
    :cond_10
    if-eqz p1, :cond_11

    .line 215
    .line 216
    invoke-static {p1, p3}, Lk1/S;->c(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-nez p1, :cond_12

    .line 221
    .line 222
    :cond_11
    invoke-interface {p0, p3}, Lk1/i;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_13

    .line 227
    .line 228
    :cond_12
    return v0

    .line 229
    :cond_13
    :goto_4
    return v1
.end method

.method public static final p(Lt0/t;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lt0/t;->k()LP/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p0, LP/d;->c:I

    .line 6
    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-object p0, p0, LP/d;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_0
    aget-object v2, p0, v1

    .line 13
    .line 14
    check-cast v2, Lt0/t;

    .line 15
    .line 16
    invoke-static {v2}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-static {v2, p1}, LS3/f;->p(Lt0/t;Ljava/util/ArrayList;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    if-lt v1, v0, :cond_0

    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public static final q(Ljava/util/ArrayList;I)I
    .locals 7

    .line 1
    const-string v0, "paragraphInfoList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-gt v3, v0, :cond_4

    .line 15
    .line 16
    add-int v4, v3, v0

    .line 17
    .line 18
    ushr-int/2addr v4, v1

    .line 19
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lz0/f;

    .line 24
    .line 25
    iget v6, v5, Lz0/f;->b:I

    .line 26
    .line 27
    if-le v6, p1, :cond_0

    .line 28
    .line 29
    move v5, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget v5, v5, Lz0/f;->c:I

    .line 32
    .line 33
    if-gt v5, p1, :cond_1

    .line 34
    .line 35
    const/4 v5, -0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v5, v2

    .line 38
    :goto_1
    if-gez v5, :cond_2

    .line 39
    .line 40
    add-int/lit8 v3, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-lez v5, :cond_3

    .line 44
    .line 45
    add-int/lit8 v0, v4, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return v4

    .line 49
    :cond_4
    add-int/2addr v3, v1

    .line 50
    neg-int p0, v3

    .line 51
    return p0
.end method

.method public static final r(Ljava/util/ArrayList;I)I
    .locals 7

    .line 1
    const-string v0, "paragraphInfoList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-gt v3, v0, :cond_4

    .line 15
    .line 16
    add-int v4, v3, v0

    .line 17
    .line 18
    ushr-int/2addr v4, v1

    .line 19
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lz0/f;

    .line 24
    .line 25
    iget v6, v5, Lz0/f;->d:I

    .line 26
    .line 27
    if-le v6, p1, :cond_0

    .line 28
    .line 29
    move v5, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget v5, v5, Lz0/f;->e:I

    .line 32
    .line 33
    if-gt v5, p1, :cond_1

    .line 34
    .line 35
    const/4 v5, -0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v5, v2

    .line 38
    :goto_1
    if-gez v5, :cond_2

    .line 39
    .line 40
    add-int/lit8 v3, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-lez v5, :cond_3

    .line 44
    .line 45
    add-int/lit8 v0, v4, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return v4

    .line 49
    :cond_4
    add-int/2addr v3, v1

    .line 50
    neg-int p0, v3

    .line 51
    return p0
.end method

.method public static s([B)I
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    array-length v1, p0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x4

    .line 6
    if-lt v1, v4, :cond_0

    .line 7
    .line 8
    move v1, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    array-length v5, p0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    aget-byte v1, p0, v2

    .line 15
    .line 16
    aget-byte v2, p0, v3

    .line 17
    .line 18
    aget-byte v0, p0, v0

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aget-byte p0, p0, v3

    .line 22
    .line 23
    shl-int/lit8 v1, v1, 0x18

    .line 24
    .line 25
    and-int/lit16 v2, v2, 0xff

    .line 26
    .line 27
    shl-int/lit8 v2, v2, 0x10

    .line 28
    .line 29
    or-int/2addr v1, v2

    .line 30
    and-int/lit16 v0, v0, 0xff

    .line 31
    .line 32
    shl-int/lit8 v0, v0, 0x8

    .line 33
    .line 34
    or-int/2addr v0, v1

    .line 35
    and-int/lit16 p0, p0, 0xff

    .line 36
    .line 37
    or-int/2addr p0, v0

    .line 38
    return p0

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-array v0, v0, [Ljava/lang/Object;

    .line 50
    .line 51
    aput-object v1, v0, v2

    .line 52
    .line 53
    aput-object v4, v0, v3

    .line 54
    .line 55
    const-string v1, "array too small: %s < %s"

    .line 56
    .line 57
    invoke-static {v1, v0}, LFe/g;->E(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0
.end method

.method public static t(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Landroid/app/Activity;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, LS3/f;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    return-object v0
.end method

.method public static final u(Lt0/t;)Lx0/h;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lt0/t;->y:Lt0/F;

    .line 7
    .line 8
    iget-object p0, p0, Lt0/F;->f:Lt0/y;

    .line 9
    .line 10
    :goto_0
    const/4 v0, 0x2

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lt0/y;->s:[LX0/E;

    .line 14
    .line 15
    invoke-static {v1, v0}, LFe/e;->H([LX0/E;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    if-eqz p0, :cond_4

    .line 28
    .line 29
    iget-object p0, p0, Lt0/y;->s:[LX0/E;

    .line 30
    .line 31
    aget-object p0, p0, v0

    .line 32
    .line 33
    check-cast p0, Lx0/h;

    .line 34
    .line 35
    if-eqz p0, :cond_4

    .line 36
    .line 37
    iget-object v2, p0, LX0/E;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lt0/y;

    .line 40
    .line 41
    :goto_1
    if-eqz v2, :cond_4

    .line 42
    .line 43
    :goto_2
    if-eqz p0, :cond_2

    .line 44
    .line 45
    iget-object v3, p0, LX0/E;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, LZ/j;

    .line 48
    .line 49
    check-cast v3, Lx0/i;

    .line 50
    .line 51
    check-cast v3, Lx0/j;

    .line 52
    .line 53
    iget-object v3, v3, Lx0/j;->b:Lx0/g;

    .line 54
    .line 55
    iget-boolean v3, v3, Lx0/g;->b:Z

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_1
    iget-object p0, p0, LX0/E;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, LX0/E;

    .line 63
    .line 64
    check-cast p0, Lx0/h;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v2}, Lt0/y;->N()Lt0/y;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    iget-object p0, v2, Lt0/y;->s:[LX0/E;

    .line 74
    .line 75
    aget-object p0, p0, v0

    .line 76
    .line 77
    check-cast p0, Lx0/h;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object p0, v1

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    return-object v1
.end method

.method public static final v(Lt0/t;)Lx0/h;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lt0/t;->y:Lt0/F;

    .line 7
    .line 8
    iget-object p0, p0, Lt0/F;->f:Lt0/y;

    .line 9
    .line 10
    :goto_0
    const/4 v0, 0x2

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lt0/y;->s:[LX0/E;

    .line 14
    .line 15
    invoke-static {v1, v0}, LFe/e;->H([LX0/E;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    if-eqz p0, :cond_3

    .line 28
    .line 29
    iget-object p0, p0, Lt0/y;->s:[LX0/E;

    .line 30
    .line 31
    aget-object p0, p0, v0

    .line 32
    .line 33
    check-cast p0, Lx0/h;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    iget-object v2, p0, LX0/E;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lt0/y;

    .line 40
    .line 41
    :goto_1
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    invoke-virtual {v2}, Lt0/y;->N()Lt0/y;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object p0, v2, Lt0/y;->s:[LX0/E;

    .line 53
    .line 54
    aget-object p0, p0, v0

    .line 55
    .line 56
    check-cast p0, Lx0/h;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object p0, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    return-object v1
.end method

.method public static w([IIII)I
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    aget v0, p0, p2

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return p2

    .line 8
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p0, -0x1

    .line 12
    return p0
.end method

.method public static x(Ltf/p;)LAf/l;
    .locals 1

    .line 1
    new-instance v0, LAf/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v0, p0}, LA6/h;->q(Ljf/c;Ljf/c;Ltf/p;)Ljf/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iput-object p0, v0, LAf/l;->c:Ljf/c;

    .line 11
    .line 12
    return-object v0
.end method

.method public static final y(LZ/k;)LV/d;
    .locals 3

    .line 1
    const-string v0, "modifier"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LG/f;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-direct {v0, p0, v1}, LG/f;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    new-instance p0, LV/d;

    .line 13
    .line 14
    const v1, -0x5e8c5df4

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {p0, v1, v2, v0}, LV/d;-><init>(IZLef/e;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public static z(Lk8/p;)Lk8/p;
    .locals 1

    .line 1
    instance-of v0, p0, Lk8/r;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Lk8/q;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lk8/q;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lk8/q;-><init>(Lk8/p;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lk8/r;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lk8/r;-><init>(Lk8/p;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_2
    return-object p0
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, LS3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, LS3/f;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LS3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method
