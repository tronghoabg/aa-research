.class public LQc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;


# static fields
.field public static final c:Ljava/util/HashMap;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQc/c;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LQc/c;->b:Z

    .line 6
    .line 7
    return-void
.end method

.method public static a(Ls8/l;)LQc/f;
    .locals 5

    .line 1
    iget-object v0, p0, Ls8/l;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ls8/l;->e:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v2, v1

    .line 10
    :goto_0
    iget-object v3, p0, Ls8/l;->g:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object v3, v1

    .line 16
    :goto_1
    new-instance v4, LQc/f;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iput-object v0, v4, LQc/f;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, p0, Ls8/l;->b:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iput-object v0, v4, LQc/f;->b:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    iput-object v2, v4, LQc/f;->c:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    iput-object v3, v4, LQc/f;->d:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v1, v4, LQc/f;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v0, p0, Ls8/l;->c:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v0, v4, LQc/f;->f:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, p0, Ls8/l;->f:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v0, v4, LQc/f;->g:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v1, v4, LQc/f;->h:Ljava/lang/String;

    .line 50
    .line 51
    iget-object p0, p0, Ls8/l;->d:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p0, v4, LQc/f;->i:Ljava/lang/String;

    .line 54
    .line 55
    iput-object v1, v4, LQc/f;->j:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v1, v4, LQc/f;->k:Ljava/lang/String;

    .line 58
    .line 59
    iput-object v1, v4, LQc/f;->l:Ljava/lang/String;

    .line 60
    .line 61
    iput-object v1, v4, LQc/f;->m:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v1, v4, LQc/f;->n:Ljava/lang/String;

    .line 64
    .line 65
    return-object v4

    .line 66
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "Nonnull field \"projectId\" is null."

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v0, "Nonnull field \"messagingSenderId\" is null."

    .line 77
    .line 78
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string v0, "Nonnull field \"appId\" is null."

    .line 85
    .line 86
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v0, "Nonnull field \"apiKey\" is null."

    .line 93
    .line 94
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0
.end method

.method public static b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, LPc/b;

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, LN0/a;->B(Luc/f;LQc/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lqc/a;->c:Luc/f;

    .line 7
    .line 8
    invoke-static {v0, p0}, LN0/a;->A(Luc/f;LQc/c;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p1, p0, LQc/c;->a:Landroid/content/Context;

    .line 14
    .line 15
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LQc/c;->a:Landroid/content/Context;

    .line 3
    .line 4
    iget-object v1, p1, Lqc/a;->c:Luc/f;

    .line 5
    .line 6
    invoke-static {v1, v0}, LN0/a;->B(Luc/f;LQc/c;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 10
    .line 11
    invoke-static {p1, v0}, LN0/a;->A(Luc/f;LQc/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
