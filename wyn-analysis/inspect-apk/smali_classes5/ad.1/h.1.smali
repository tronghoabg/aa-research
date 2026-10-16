.class public final Lad/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;

.field public final d:Lad/e;

.field public final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lad/e;Ljava/util/Map;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lad/h;->a:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lad/h;->b:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lad/h;->c:Ljava/util/List;

    .line 25
    iput-object p4, p0, Lad/h;->d:Lad/e;

    .line 26
    iput-object p5, p0, Lad/h;->e:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lx6/t;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lx6/t;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lad/h;->a:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p1, Lx6/t;->a:LD6/H0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LD6/H0;->zze()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Could not forward getMediationAdapterClassName to ResponseInfo."

    .line 4
    invoke-static {v2, v1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    move-object v1, v0

    .line 5
    :goto_0
    iput-object v1, p0, Lad/h;->b:Ljava/lang/String;

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iget-object v2, p1, Lx6/t;->b:Ljava/util/ArrayList;

    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx6/i;

    .line 9
    new-instance v4, Lad/e;

    invoke-direct {v4, v3}, Lad/e;-><init>(Lx6/i;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_1
    iput-object v1, p0, Lad/h;->c:Ljava/util/List;

    .line 11
    iget-object v1, p1, Lx6/t;->c:Lx6/i;

    if-eqz v1, :cond_2

    .line 12
    new-instance v0, Lad/e;

    .line 13
    invoke-direct {v0, v1}, Lad/e;-><init>(Lx6/i;)V

    iput-object v0, p0, Lad/h;->d:Lad/e;

    goto :goto_2

    .line 14
    :cond_2
    iput-object v0, p0, Lad/h;->d:Lad/e;

    .line 15
    :goto_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    invoke-virtual {p1}, Lx6/t;->a()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 17
    invoke-virtual {p1}, Lx6/t;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lx6/t;->a()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 19
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 20
    :cond_3
    iput-object v0, p0, Lad/h;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lad/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lad/h;

    .line 12
    .line 13
    iget-object v1, p1, Lad/h;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lad/h;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lad/h;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lad/h;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lad/h;->c:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lad/h;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lad/h;->d:Lad/e;

    .line 44
    .line 45
    iget-object p1, p1, Lad/h;->d:Lad/e;

    .line 46
    .line 47
    invoke-static {v1, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    return v0

    .line 54
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lad/h;->c:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lad/h;->d:Lad/e;

    .line 4
    .line 5
    iget-object v2, p0, Lad/h;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lad/h;->b:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    new-array v4, v4, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v2, v4, v5

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aput-object v3, v4, v2

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    aput-object v0, v4, v2

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    aput-object v1, v4, v0

    .line 23
    .line 24
    invoke-static {v4}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
.end method
