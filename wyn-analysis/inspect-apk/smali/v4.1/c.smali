.class public final synthetic Lv4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/l;
.implements Lw4/a;


# instance fields
.field public final synthetic a:LD6/o;

.field public final synthetic b:[Z

.field public final synthetic c:Lx4/e;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ltc/g;


# direct methods
.method public synthetic constructor <init>(LD6/o;[ZLx4/e;Ljava/lang/String;Ltc/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv4/c;->a:LD6/o;

    iput-object p2, p0, Lv4/c;->b:[Z

    iput-object p3, p0, Lv4/c;->c:Lx4/e;

    iput-object p4, p0, Lv4/c;->d:Ljava/lang/String;

    iput-object p5, p0, Lv4/c;->e:Ltc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/c;->a:LD6/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv4/c;->b:[Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget-boolean v3, v1, v2

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v3, 0x1

    .line 15
    aput-boolean v3, v1, v2

    .line 16
    .line 17
    iget-object v1, p0, Lv4/c;->c:Lx4/e;

    .line 18
    .line 19
    iget-object v2, v0, LD6/o;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lx4/c;

    .line 22
    .line 23
    iget-object v2, v2, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lx4/e;->e()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, LD6/o;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    iget-object v1, p0, Lv4/c;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lgc/b;->M(Landroid/location/Location;)Ljava/util/HashMap;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lv4/c;->e:Ltc/g;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public onError(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/c;->a:LD6/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv4/c;->b:[Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget-boolean v3, v1, v2

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v3, 0x1

    .line 15
    aput-boolean v3, v1, v2

    .line 16
    .line 17
    iget-object v1, p0, Lv4/c;->c:Lx4/e;

    .line 18
    .line 19
    iget-object v2, v0, LD6/o;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lx4/c;

    .line 22
    .line 23
    iget-object v2, v2, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lx4/e;->e()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, LD6/o;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    iget-object v1, p0, Lv4/c;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lpd/f;->h(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {p1}, Lpd/f;->g(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Lv4/c;->e:Ltc/g;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v1, v0, p1, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
