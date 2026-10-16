.class public final Lcom/google/gson/internal/bind/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/reflect/Method;

.field public final synthetic e:Lla/z;

.field public final synthetic f:Lla/z;

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Lla/z;Lla/z;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/gson/internal/bind/o;->d:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/google/gson/internal/bind/o;->e:Lla/z;

    .line 7
    .line 8
    iput-object p5, p0, Lcom/google/gson/internal/bind/o;->f:Lla/z;

    .line 9
    .line 10
    iput-boolean p6, p0, Lcom/google/gson/internal/bind/o;->g:Z

    .line 11
    .line 12
    iput-boolean p7, p0, Lcom/google/gson/internal/bind/o;->h:Z

    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/gson/internal/bind/o;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/google/gson/internal/bind/o;->b:Ljava/lang/reflect/Field;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/google/gson/internal/bind/o;->c:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lra/b;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/bind/o;->b:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/gson/internal/bind/o;->d:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    new-array v2, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v1, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    invoke-static {v1, v0}, Lpa/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    new-instance v0, Lla/p;

    .line 21
    .line 22
    const-string v1, "Accessor "

    .line 23
    .line 24
    const-string v2, " threw exception"

    .line 25
    .line 26
    invoke-static {v1, p2, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v1, 0xd

    .line 35
    .line 36
    invoke-direct {v0, p2, p1, v1}, LE5/Q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_0
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    if-ne v0, p2, :cond_1

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object p2, p0, Lcom/google/gson/internal/bind/o;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lra/b;->w(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/google/gson/internal/bind/o;->e:Lla/z;

    .line 53
    .line 54
    invoke-virtual {p2, p1, v0}, Lla/z;->c(Lra/b;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
