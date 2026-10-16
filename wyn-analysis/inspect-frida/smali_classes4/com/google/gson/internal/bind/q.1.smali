.class public final Lcom/google/gson/internal/bind/q;
.super Lcom/google/gson/internal/bind/p;
.source "SourceFile"


# instance fields
.field public final b:Lna/m;


# direct methods
.method public constructor <init>(Lna/m;Lcom/google/gson/internal/bind/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/google/gson/internal/bind/p;-><init>(Lcom/google/gson/internal/bind/r;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/q;->b:Lna/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/bind/q;->b:Lna/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lna/m;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final f(Ljava/lang/Object;Lra/a;Lcom/google/gson/internal/bind/o;)V
    .locals 1

    .line 1
    iget-object v0, p3, Lcom/google/gson/internal/bind/o;->f:Lla/z;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p3, Lcom/google/gson/internal/bind/o;->g:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p3, Lcom/google/gson/internal/bind/o;->b:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    iget-boolean p3, p3, Lcom/google/gson/internal/bind/o;->h:Z

    .line 18
    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    invoke-static {v0, p1}, Lpa/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, Lla/p;

    .line 31
    .line 32
    const-string p3, "Cannot set value of \'static final\' "

    .line 33
    .line 34
    invoke-static {p3, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/16 p3, 0xd

    .line 39
    .line 40
    invoke-direct {p2, p1, p3}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    throw p2
.end method
