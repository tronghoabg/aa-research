.class final Lcom/google/android/play/core/integrity/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/play/core/integrity/aw;


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/w;

.field private final b:Li8/i;

.field private final c:Li8/i;

.field private final d:Li8/i;

.field private final e:Li8/i;

.field private final f:Li8/i;

.field private final g:Li8/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/v;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/google/android/play/core/integrity/w;->a:Lcom/google/android/play/core/integrity/w;

    .line 5
    .line 6
    new-instance p2, LJ4/c;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p2, p1, v0}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/google/android/play/core/integrity/w;->b:Li8/i;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/play/core/integrity/bb;->a()Lcom/google/android/play/core/integrity/bc;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Li8/g;->b(Li8/h;)Li8/g;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/google/android/play/core/integrity/w;->c:Li8/i;

    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/play/core/integrity/n;->a()Lcom/google/android/play/core/integrity/o;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/google/android/play/core/integrity/au;

    .line 31
    .line 32
    invoke-direct {v1, p2, v0}, Lcom/google/android/play/core/integrity/au;-><init>(Li8/i;Li8/i;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/google/android/play/core/integrity/w;->d:Li8/i;

    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/play/core/integrity/n;->a()Lcom/google/android/play/core/integrity/o;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, Lcom/google/android/play/core/integrity/bp;

    .line 42
    .line 43
    invoke-direct {v2, p2, p1, v1, v0}, Lcom/google/android/play/core/integrity/bp;-><init>(Li8/i;Li8/i;Li8/i;Li8/i;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Li8/g;->b(Li8/h;)Li8/g;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/google/android/play/core/integrity/w;->e:Li8/i;

    .line 51
    .line 52
    new-instance p2, Lcom/google/android/play/core/integrity/bu;

    .line 53
    .line 54
    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/bu;-><init>(Li8/i;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, Li8/g;->b(Li8/h;)Li8/g;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iput-object p2, p0, Lcom/google/android/play/core/integrity/w;->f:Li8/i;

    .line 62
    .line 63
    new-instance v0, Lcom/google/android/play/core/integrity/ba;

    .line 64
    .line 65
    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/ba;-><init>(Li8/i;Li8/i;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Li8/g;->b(Li8/h;)Li8/g;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lcom/google/android/play/core/integrity/w;->g:Li8/i;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 76
    .line 77
    const-string p2, "instance cannot be null"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/w;->g:Li8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Li8/i;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    .line 8
    .line 9
    return-object v0
.end method
